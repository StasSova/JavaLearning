package itstep.learning.oop;

public class OopDemo {
    public void run()
    {
        new AutoShop().run();
    }
}

/*
ООП - парадигма - підхід, набір традицій, засобів, інструментів до програмування

Функціональна
    Stack-oriented programming
ООП
    Прототипна
Імперативна
    Процедурна
Декларативна
    Логічна

Продаж авто

Audi Q5          | Crossover | Name
Lamborghini Urus | Crossover | Сlearance
Honda CR-V       | Crossover |
BMW X5           | Crossover |

Toyota Corolla | Car | Name
BMW 320        | Car | CarBody
VW Golf        |     |
Honda Accord   | Car |
Audi RS6       | Car |

Renault C-Truck   | Truck | Name
Mercedes Actros L | Truck | Cargo
DAF XF 106 2018   | Truck |

Renault Master          | Bus | Name
Mercedes-Benz Sprinter  |     | Capacity
Bogdan A092             |     |
Volvo 9700              | Bus |

Kawasaki Ninja            | Bike | Name
Harley-Davidson Sportster | Bike | Type


AutoShop <>---> Vehicle (транспортний засіб)
                 [Name, getInfo()]
                   △
                 / | \
    Bike     Bus      Truck   Car      Crossover
    [Name    Name     Name    Name      Name]
   [Type] [Capacity] [Cargo] [CarBody] [Сlearance]


Vehicle [name, getName()]
Bike{type}:Vehicle
Bike [ [name, getName()] type, getType(), name? ]

----------------------------------------------------------------
Інтерфейси (в ООП) - абстрактні класи, які можуть містити
 - тільки public,
 - тільки abstract,
 - тільки методи
Ролі:
 - маркер (інтерфейс-маркер) як ознака належності класу до
    певної групи (у т.ч. при передачі до методів, масивів,
    сервісів тощо). Такі інтерфейси можуть бути порожні
    (без методів) і доволі часто формують окрему групу
    інтерфейсів - анотацій (Java) або атрибутів (у C#)
- контракт (інтерфейс-контракт) як набір вимог для
    імплементації з метою участі у діях, що потребують
    цих вимог

Щодо абстракції:
абстракція - узагальнення, генералізація, - поєднання сутностей
у групи. Іншими словами, абстрактний термін (абстракція)
позначає не конкретний елемент, а їх групу. Це природньо у
людських мовах: будинок, стіл, монітор, ..., проте не так
у програмуванні - кожен об'єкт є конкретикою і створення
абстракцій - окрема діяльність.

Абстракція інтерфейсу:
автівки можуть бути дизельні та бензинові - яка це ознака?
  це ознака об'єктна, не інтерфейсна - різні об'єкти одного класу
  можуть як такими, так і іншими.
автівки можуть бути крупногабаритними
  це ознака інтерфейсна, оскільки ВСІ об'єкти одно класу
  автоматично мають (або не мають) цю ознаку, не може бути
  двох байків - один крупногабаритний, інший - ні

 */
