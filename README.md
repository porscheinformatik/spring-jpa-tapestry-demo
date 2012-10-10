# Demo application with Spring, Spring Data JPA and Tapestry

This demo is used to test JRebel with this configuration. 

Currently, this results in a "java.lang.NullPointerException: null" in ProxyTransactionManagementConfiguration:47 
after adding a method to PersonService. The exception happens when reloading the page.

This is what JRebel sais directly after changing the class:
[2012-10-10 10:47:55] JRebel: Reloading class 'at.porscheinformatik.demo.PersonService'.
