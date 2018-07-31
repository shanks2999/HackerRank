var myButton = document.createElement('button');
myButton.id = 'btn';
myButton.innerHTML = '0';
// myButton.style.fontSize = '24px'
// myButton.style.width = '96px'
// myButton.style.height = '48px'
myButton.className ="myStyleClass"
document.body.appendChild(myButton);
myButton.addEventListener("click", function() {
                /* This changes the button's label */
                myButton.innerHTML = parseInt(myButton.innerHTML)+1;
            });