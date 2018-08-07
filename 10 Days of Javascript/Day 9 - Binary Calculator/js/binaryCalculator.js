var res = document.getElementById('res');
var myDiv = document.getElementById('btns');
var btns = [];
for (var i = 0; i < myDiv.getElementsByTagName('button').length; i++)
    btns.push(myDiv.getElementsByTagName('button')[i])

for (var i = 0; i < btns.length; i++)
    btns[i].addEventListener('click', action);

function action(e) {
    var btn = e.target || e.srcElement;
    switch(btn.innerHTML)
    {
        case '0':
        case'1':
        case '+':
        case'-':
        case '*':
        case'/':
            res.innerHTML += btn.innerHTML;
            break;
        case'C':
            res.innerHTML = '';
            break;
         case'=':
            var str = res.innerHTML;
            var a, b, op;
            for(var i=0;i<str.length;i++)
            {
                if(str.charAt(i)=='+' || str.charAt(i)=='-' || 
                  str.charAt(i)=='*' || str.charAt(i)=='/')
                    {
                        a = str.substring(0, i);
                        b = str.substring(i+1, str.length);
                        op = str.charAt(i);
                        break;
                    }
            }
            a = parseInt(a, 2);
            b = parseInt(b, 2);
            var result = eval(a+op+b);
            res.innerHTML = result.toString(2);
            break;
    }

    // document.getElementById(btn.id).innerHTML++;
}