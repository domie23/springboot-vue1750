const base = {
    get() {
        return {
            url : "http://localhost:8080/shaoerbianchengzaixianpeixun/",
            name: "shaoerbianchengzaixianpeixun",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shaoerbianchengzaixianpeixun/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "少儿编程在线培训系统"
        } 
    }
}
export default base
