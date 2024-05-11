const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2hqxt/",
            name: "ssm2hqxt",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2hqxt/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信平台健身小助手小程序"
        } 
    }
}
export default base
