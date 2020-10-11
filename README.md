# Musical Octo Pancake
![pancakes](https://i.imgur.com/2KnUGad.png)

Musical Octo Pancake is exactly what it sounds like, a new revolutionary trend in the dying world of Java. Don't wait for Java to die, kill it today with this amazing library. It's quick and simple!

## Prerequisites
- Git
- Maven
- Java 11

## Installation

First lets clone the repository using the command bellow, this should create a new folder named after the repository.

```bash
git clone git@github.com:jaroslawjanas/musical-octo-pancake.git
```

Go into the repository folder.

```bash
cd musical-octo-pancake
```

Almost there, now run

```bash
mvn package
```

to run the tests and compile a jar file that you can use. After the process ends you can find the packaged jar file in `musical-octo-pancake\target\musical-octo-pancake-<version>-<release>.jar`

## Usage

```java
import musical_octo_pancake.Student;

Student student = new Student();

student.setDob("27/01/1998");
student.setDob(new DateTime(1998, 01, 27, 0, 0));

student.getId() // Automatically generated

student.setName("Josh");

student.getName(); // "Josh22" - combination of name and age
```

## Contributing
Pull requests, while unnecessary, are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
