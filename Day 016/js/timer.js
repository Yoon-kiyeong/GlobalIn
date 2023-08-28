function printTime() {
    let myDate = new Date();
    let days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

    // 년, 월, 일, 시, 분, 초를 저장하는 배열 생성
    let yy = myDate.getFullYear();
    let mm = myDate.getMonth() + 1;
    let dd = myDate.getDate();
    // 0: 일요일, 1: 월요일, 2: 화요일, 3: 수요일, 4: 목요일, 5: 금요일, 6: 토요일

    let i = myDate.getDay();
    let day = days[i];

    //시, 분, 초
    let hour = myDate.getHours();
    let minute = myDate.getMinutes();
    let second = myDate.getSeconds();

    // 완성된 현재 시간을 보여 줌
    var result = yy + "-" + mm + "-" + dd + "-" + day + "-" + hour + "-" + minute + "-" + second;

    // id 속성 값이 timer인 태그에 결과를 출력
    document.getElementById("timer").innerHTML = result;
}

function startTime() {
    //setInterval() : 1초마다 한번씩 함수 호출
    //printTime() : 함수를 1초에 한번씩 반복해서 자동으로 호출
    setInterval(printTime, 1000);

}

