/* JavaScript의 객체지향

    클래스라는 객체의 설계도를 먼저 작성하고, 클래스에서 객체를 만들어 내는 java언어와 다르게
    빈 객체를 생성하고, 그 안에 변수나 함수를 추가하는 과정으로 객체지향을 구현한다.

    자바스크립트에서의 객체의 의미
        - 변수아 함수를 개발자의 판단에 따라 하나의 변수에 저장하는 그룹단위
        - 객체 안에 포함된 변수를 멤버변수 라고 함
        - 객체 안에 포함된 함수를 멤버함수 라고 함
*/

let people = {}; // 비어있는 객체

// 객체 안에 변수를 추가
people.name = '윤기영';
people.gender = '남자';

// 멤버변수(프로퍼티)의 이용
document.write("<h1>" + people.name + "은 " + people.gender + "입니다." + "</h1>");

// 객체 안에 함수를 추가
people.sayName = function() {
    // 객체 안에 포함된 함수에서, 멤버변수에 접근하기 위해서는 반드시 "this." 이라고 하는 예약어를 사용한다. //
    document.write("<h1>" + this.name + "</h1>");
}

people.getName = function() {
    return this.name;
}

people.getGender = function() {
    return this.gender;
}

people.sayGender = function() {
    document.write("<h1>" + this.gender + "</h1>");
}

people.saySomething = function(msg) {
    document.write("<h1>" + msg + "</h1>");
}

people.sayInfo = function() {
    document.write("<h1>" + this.getName() + "님은 " + this.getGender() + "입니다." + "</h1>");
}

// 객체 안에 있는 메소드 호출
people.sayName();
people.sayGender();
people.saySomething("괜찮아, 다 잘될거야");
people.sayInfo();