let myDate = new Date();

let yy = myDate.getFullYear();
let dd = myDate.getDate();

function getDday(y, m, d) {
    let today = new Date();
    let dday = new Date(y, m-1, d);
    
    let cnt = dday.getTime() - today.getTime();
    let n = Math.ceil(cnt / (24 * 60 * 60 * 1000));

    return n;
}

let dday = getDday(yy, 12, 31);

document.write("<h1> 앞으로 남은 올해의 날짜는 " + dday + "일 남았습니다");

