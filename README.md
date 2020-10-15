# java1.0
java课程作业项目仓库

#阅读程序

##实验目的
……………………………………
用类描述计算机中CPU的速度和硬盘的容量，
利用Eclipse进行源代码的编译、调试及运行。
……………………………………
##实验过程
……………………………………
首先了解程序概况，一共分四类，Test主类和CPU、HardDisk、PC三个分类。
其中CPU类，用getSpeed()返回speed的值，用setSpeed(int m)方法将参数m的值赋值给speed
HardDisk类用getAmount()返回amount的值，用setAmount(int m)方法将参数m的值赋值给amount
PC类用setCPU(CPU c)将参数c的值赋值给cpu，使用setHardDisk (HardDisk h)方法将参数h的值赋值给HD
……………………………………
##实验结果
……………………………………
核心代码
CPU类：
public class CPU { 
 int speed; 
 int getSpeed(){ 
 return speed; 
 } 
 public void setSpeed(int speed){ 
 this.speed = speed; 
 } 
 } 
 HardDisk类：
 public class HardDisk { 
 int amount; 
 int getAmount() { 
 return amount;  
 } 
 public void setAmount(int amount){ 
 this.amount = amount; 
 } 
   } 
 PC类：
 public class PC { 
 CPU cpu; 
 HardDisk HD; 
 void setCPU(CPU cpu){ 
 this.cpu = cpu; 
 } 
 void setHardDisk(HardDisk HD){ 
 this.HD = HD; 
 } 
 void show(){ 
 System.out.println("CPUËÙ¶È£º"+cpu.getSpeed()); 
 System.out.println("Ó²ÅÌËÙ¶È£º"+HD.getAmount()); 
 } 
   } 
……………………………………
##实验感想
……………………………………
通过本次实验，我初次使用get，set函数，温习了实参的调用，例如PC类中调用的setCPU（）的方法，实参是CPU。

……………………………………
