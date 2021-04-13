package org.zhouhy.springmvc;


/**
 * 1. 关于RequestMapping 的一些路径问题
 *  1) @RequestMapping(value = "page*") /pageabc, /pagebcd 都是可以访问的
 *  2) @RequestMapping(value = "view/*") view/abc, view/bdd 可以访问, 但是view/b/c 就不行 表示一层目录 
 * 
 * 2. 关于@RequestParam 请参看本例的IndexController 
 * 
 * 3. 关于lombok的使用, 如果要使用@Slf4j的日志, 光有lombok一个依赖是不够的, 还需要加入日志依赖, 在这里加的是slf4j-simple
 * 
 * 4. 可以在project structure里面的 Artifacts 里面手动加入jar文件, 具体参考网易有道云笔记
 * 
 * */
public class App {
}
