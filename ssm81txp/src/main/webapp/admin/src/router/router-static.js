import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xueshengfankui from '@/views/modules/xueshengfankui/list'
    import xueshengyuyue from '@/views/modules/xueshengyuyue/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import shiyanxuanke from '@/views/modules/shiyanxuanke/list'
    import shiyanshi from '@/views/modules/shiyanshi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import shiyankecheng from '@/views/modules/shiyankecheng/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xueshengfankui',
        name: '学生反馈',
        component: xueshengfankui
      }
      ,{
	path: '/xueshengyuyue',
        name: '学生预约',
        component: xueshengyuyue
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/shiyanxuanke',
        name: '实验选课',
        component: shiyanxuanke
      }
      ,{
	path: '/shiyanshi',
        name: '实验室',
        component: shiyanshi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/shiyankecheng',
        name: '实验课程',
        component: shiyankecheng
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
