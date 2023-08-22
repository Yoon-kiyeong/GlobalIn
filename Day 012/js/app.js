// var myage = 19;
// == : 같다 != : 다르다

// var myage = prompt("나이를 입력하세요.");   // 나이를 입력받으면 모든 입력 부분에 있어서 문자별로 처리한다.
// myage = parseInt(myage);    // 나이는 숫자이기 떄문에 정수로 변환처리해야함
//parseInt() : 문자열을 숫자로 변환해주는 함수

// if (myage == 19) { // 조건이 참일 때만 블록 안의 내용을 수행한다.
//     document.write('<h1>나의 나이는 19살 입니다.</h1>');
// } else if(myage <= 19) {
//     document.write('<h1>당신은 아직 자라야 할 미성년입니다.');
// } else {
//     document.write('<h1>나의 나이는 ' + myage + "살 입니다.");
// }

// if (myage != 19) { 
//     document.write('<h1>나의 나이는 29살 입니다.</h1>');

// var kor;
// var eng;
// var math;
// var sum = 0;
// var avg = 0;

// kor = parseInt(prompt("국어 점수를 입력하세요."));
// eng = parseInt(prompt("영어 점수를 입력하세요."));
// math = parseInt(prompt("수학 점수를 입력하세요."));

// console.log(kor);
// console.log(eng);
// console.log(math);

// document.write("국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + math + '<br>') ;

// sum = kor + eng + math;
// console.log(sum);
// document.write("총점 : " + sum + '<br>');

// avg = sum / 3;
// console.log(avg);
// document.write("평균 : " + avg + '<br>');
// var score = 0;
// score = parseInt(score);
// if (avg >= 90) {
//     document.write("A 학점");
// } else if (avg >= 80 ) {
//     document.write("B 학점");
// } else if (avg >= 70) {
//     document.write("C 학점");
// } else if (avg >= 60) {
//     document.write("D 학점");
// } else {
//     document.write("F 학점");
// }

/*
Switch(조건식) {
    case 값1:
        case문의 값이 일치할 경우 수행하는 문장
            break;
    case 값2:
        case문의 값이 일치할 경우 수행하는 문장
            break;
    case 값3:
        case문의 값이 일치할 경우 수행하는 문장
            break;
    case 값4:
        case문의 값이 일치할 경우 수행하는 문장
            break;
    default:
         case문의 값이 일치할 경우 수행하는 문장
}
*/

// switch(parseInt(avg / 10)) {
//     case 10:
//     case 9:
//         score = 'A';
//         break;
//     case 8:
//         score = 'B';
//         break;
//     case 7:
//         score = 'C';
//         break;
//     case 6:
//         score = 'D';
//         break;
//     case 5: 
//     case 4: 
//     case 3: 
//     case 2: 
//     case 1:
//         score = 'F';
//         break;
//     default:
//         document.write("");
// }

// document.write("당신의 총점은 " + sum + "점이며, 학점은 " +  score + "학점입니다");

var a = 7, b = 3, c = 0;
document.write("자리를 바꾸기 전 a = " + a + ", 자리를 바꾸기 전 b = " + b + ", 자리를 바꾸기 전 c = " + c);
document.write("<br>");

if (a > b) {
    // c = a;
    // a = b;
    // b = c;
    
    a = a ^ b;
    b = b ^ a;
    a = a ^ b;

}

document.write("자리를 바꾸기 후 a = " + a + ", 자리를 바꾸기 후 b = " + b + ", 자리를 바꾸기 후 c = " + c);














