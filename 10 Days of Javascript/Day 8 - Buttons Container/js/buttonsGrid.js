var myDiv = document.getElementById('btns');
var btns = [];
for (var i = 0; i < myDiv.getElementsByTagName('button').length; i++)
    btns.push(myDiv.getElementsByTagName('button')[i])

btns[4].addEventListener("click", function() {
    var temp = btns[0].innerHTML;
    btns[0].innerHTML = btns[3].innerHTML;
    btns[3].innerHTML = btns[6].innerHTML;
    btns[6].innerHTML = btns[7].innerHTML;
    btns[7].innerHTML = btns[8].innerHTML;
    btns[8].innerHTML = btns[5].innerHTML;
    btns[5].innerHTML = btns[2].innerHTML;
    btns[2].innerHTML = btns[1].innerHTML;
    btns[1].innerHTML = temp;
});