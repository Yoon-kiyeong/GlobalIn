// 빈 객체 생성
let calculator = {};

calculator.x = 0;
calculator.y = 0;

//멤버 변수값을 변경시키는 메소드 추가
calculator.setValue = function(p1, p2) {
    //파라미터(p1, p2)값을 멤벼변수에 대입한다.
    this.x = p1;
    this.y = p2;
}

//멤버 변수끼리 덧셈하여 결괏값을 리턴하는 메소드 정의
calculator.add = function() {
    return this.x + this.y;
}

//덧셈과 뺄셈의 결과를 리턴받아 출력하는 메소드 정의
calculator.result = function() {
// 어떤 메소드 안에서 같은 객체안에 존재하는 다른 메소드를 호출하는 경우
// "this" 키워드를 사용해야만 한다.
    let v1 = this.add();
    let v2 = this.min();

    document.write("<p>x + y = " + v1 + "</p>");
    document.write("<p>x - y = " + v2 + "</p>");
}

//멤버 변수끼리 뺄셈하여 결괏값을 리턴하는 메소드 정의
calculator.min = function() { 
    return this.x - this.y;
}

//멤버 변수끼리 곱셈하여 결괏값을 리턴하는 메소드 정의
calculator.mul = function() {
    return this.x * this.y;
}

//멤버 변수끼리 나눗셈하여 결괏값을 리턴하는 메소드 정의
calculator.divide = function() {
    return this.x / this.y;
}


document.write("<h1>calculator" + "</h1>");
calculator.setValue(100,10);
calculator.result();