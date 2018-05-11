Домашна работа № 6 / седмица 8 
# Символни низове 
 
**Задача 1.** 
• Да се реализира **клас Публикация (Post)**, която се определя от пореден номер (задава се автоматично с 1 по-голям от този на предходната публикация), заглавие на публикацията и текст на публикацията. Класът Публикация трябва да има минимум следните методи: 
1. Метод, който проверява дали даден низ се среща като подниз в заглавието на публикацията; 
2. Метод, който връща колко пъти даден низ се среща като подниз в текста на публикацията; 
• Да се реализира клас **Блог (Blog)**, който има списък от публикации. В клас Блог да се реализира минимум следния метод: 
1. Метод, който по даден низ отпечатва списък със заглавията на публикациите, в които този низ се среща като подниз в текста на публикацията. Трябва първо да се отпечатват публикациите, в текста, на които подниза се среща най-често. Пример: Низът е OOP Заглавие: Definition of OOP Concepts in Java (https://stackify.com/oops-concepts-in-java/) Текст: OOP concepts in Java are the main ideas behind Java’s Object Oriented Programming. They are an abstraction, encapsulation, inheritance, and polymorphism. Grasping them is key to understanding how Java works. Basically, Java OOP concepts let us create working methods and variables, then reuse all or part of them without compromising security. 
 
Заглавие: What is object oriented programming (OOP)?  (https://www.nextacademy.com/blog/object-oriented-programming-oop/) Текст: Object Oriented Programming (OOP) is the foundation of mastering most of the widely used programming languages such as Java, Python, Ruby and, of course, Swift. It helps you in the process of designing your app because an app without any proper planning will make you go crazy (trust me, been there, done that). 
 
В текста на първата публикация търсения низ (OOP) се среща 2 пъти, а във втората публикация веднъж. 