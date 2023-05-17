function Person(name,age){
    this.name = name;
    this.age = age;
    this.sayname = sayname;

}
function sayname(){
    console.log(this.name);
}
var p1 = new Person("Alice",18);
var p2 = new Person("Elen",20);

p1.sayname();
p2.sayname();