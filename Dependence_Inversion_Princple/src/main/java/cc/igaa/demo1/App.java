package cc.igaa.demo1;

import cc.igaa.demo1.f.JavaBook;
import cc.igaa.demo1.f.Person;
import cc.igaa.demo1.z.JavaBook2;
import cc.igaa.demo1.z.Person2;
import cc.igaa.demo1.z.PythonBook2;

public class App {
    public static void main(String[] args) {
        /*
         * 依赖倒置原则。
         * 概念：
         *  高层模块(调用者)不应该依赖于低层模块(被调用者)；高层模块以及低层模块都应该依赖抽象。
         *  抽象不应该依赖细节，细节应该依赖抽象。
         */
        
        /*
        * 反例：
        *  如果需要Person去读其他书籍，那么就必须要修改我们的read方法。
        *  这就违反了开闭原则，且Person已经与具体的实现完全绑定。
        *
        * 高层模块(Person)几乎完成依赖于低层模块(JavaBook)。
        * */
        Person person = new Person();
        person.read(new JavaBook());
        
        /*
        *正例：
        *  高层调用者以及低层调用者都应该依赖于抽象。
        *  我们在无需改动read的情况下就能够去读一本新的书。
        *
        *  调用者不应该依赖于JavaBook以及PythonBook。
        *  在新增一本书的同时，我们只需要构建新的实现即可。
        **/
        Person2 person2 = new Person2();
        //读Java
        JavaBook2 javaBook2 = new JavaBook2();
        person2.setiBook(javaBook2);
        person2.read();
        //读书python
        PythonBook2 pythonBook2 = new PythonBook2();
        person2.setiBook(pythonBook2);
        person2.read();
    }
}
