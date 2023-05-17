var person = new Object();
person.age = 18;
person.name = "孙悟空";
person.height = 1.88;
person.weight = 220;
{
    console.log("Person:"+person);
    console.log("type:"+typeof person);
}
delete person.name;