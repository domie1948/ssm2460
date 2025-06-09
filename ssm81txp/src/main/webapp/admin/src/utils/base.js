const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm81txp/",
            name: "ssm81txp",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm81txp/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校实验室管理系统"
        } 
    }
}
export default base
