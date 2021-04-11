package org.zhouhy.springmvc;


/**
 * 1. 关于RequestMapping 的一些路径问题
 *  1) @RequestMapping(value = "page*") /pageabc, /pagebcd 都是可以访问的
 *  2) @RequestMapping(value = "view/*") view/abc, view/bdd 可以访问, 但是view/b/c 就不行 表示一层目录 
 * 
 * 2. 关于@RequestParam 请参看本例的IndexController 
 * 
 * */
public class App {
}
