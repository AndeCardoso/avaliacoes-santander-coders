class Person {
    constructor(firstName, lastName, age, gender, interests) {
        this.name = {firstName, lastName};
        this.age = age;
        this.gender = gender;
        this.interests = interests;
        this.bio = `${this.name.firstName} ${this.name.lastName} is ${this.age} years old. They like ${this.interests.join(', ')}.`;
    }

    greeting() {
        return `Hi! I'm ${this.name}`;
    }
}

class Teacher extends Person {
    constructor(firstName, lastName, age, gender, interests, subject) {
        super(firstName, lastName, age, gender, interests);
        this.subject = subject;
    }

    greeting() {
        if (this.gender === 'male') {
            return `Hello. My name is Mr. ${this.name.lastName}, and I teach ${this.subject}.`;
        } 
        if (this.gender === 'female') {
            return `Hello. My name is Mrs. ${this.name.lastName}, and I teach ${this.subject}.`;
        } else {
            return `Hello. My name is Mx. ${this.name.lastName}, and I teach ${this.subject}.`;
        }
    }
}

class Student extends Person {

    greeting() {
        return `Yo! I'm ${this.name.firstName}.`;
    }
}

let eu = new Teacher('Anderson', 'Cardoso', 27, 'male', ['video games', 'food', 'movies', 'animes'], 'Informatica')

console.log(eu);