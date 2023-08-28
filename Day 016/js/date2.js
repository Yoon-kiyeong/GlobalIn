// 올해의 날짜가 얼마나 지나갔는가?

let theDay = new Date(2023,0,1);
let today = new Date();

let cnt = today.getTime() - theDay.getTime();
let day = Math.floor(cnt / (24 * 60 * 60 * 1000));

document.write("<h1> 올해는 " + cnt + "일 지났습니다" + "</h1>");
document.write("<h1> 올해는 " + day + "일 지났습니다" + "</h1>");

