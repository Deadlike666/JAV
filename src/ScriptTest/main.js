function creatperson(name,age){
    var obj = new Object();
    obj.name = name;
    obj.age = age;
    obj.sayName = function (){
        console.log(this.name);
    };
    return obj;
}
var person1 = creatperson("王龙森",18);
var person2 = creatperson("李玮成",20);
var person3 = creatperson("刘振",22);
console.log(person3);
console.log(person2);
console.log(person1);
for(var i=1;i<=1000;i++){
    var person = creatperson("person"+i);
    console.log(typeof person);
}
