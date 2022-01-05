# Behavioral Design Patterns


## Author: Caragiu Victor

----

## Objectives:

1. Study and understand the Behavioral Design Patterns.

2. As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.

3. Implement some additional functionalities using behavioral design patterns.


## Used Design and Creational Patterns: 

* Facade
* Chain of responsability


## Implementation

Alonside the Facade pattern for displaying the catalog with car configurations, I added the assembly line simulation for car manufacturing with choosing of a specific configuration. The Chain of Responsability was used and implemented the following way.
 
<image src="/examples/Diagram.png"><br/>

The chain is called by the base handler, and passing the object to work on (car), the type of configuration, and the type of work.

<image src="/examples/call.png"><br/>


The handler for a specific configuration (paint) looks like this:
```
public Car work(Car car, String type, WorkType workType) {
    if (workType == WorkType.PAINT) {
        System.out.println(String.format("Painting with '%s'", type));
        car.setColor(type);
    } else {
        car = super.work(car, type, workType);
    }
    return car;
}
```
So, if it is not supposed to change the object, it passes the object to the next handler.

## Test
<image src="/examples/Output.png"><br/>

