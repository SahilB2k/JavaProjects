// document.getElementById("count-el").innerText = 5

//  function increment(){
//     console.log("button is clicked");
//  }

// function countdown(){
//     console.log(5)
//     console.log(4)
//     console.log(3)
//     console.log(2)
//     console.log(1)
//     console.log(0)
// }

// function performance(){
//     let lap1 = 23;
//     let lap2 = 20;
//     let lap3 = 30;
//     let lap4 = 22;
//     console.log(lap1+lap2);
//     console.log(lap2+lap3);
//     console.log(lap3+lap4);
//     console.log(lap4+lap1);

// }
let saveEl = document.getElementById("save-el");
let countEl = document.getElementById("count-el");
let count = 0;
console.log(saveEl); 
function increment(){
    count = count + 1;
    countEl.textContent = count;
    
}

function save(){
    console.log(count);
}



function save(){
   let countStr =  count + " - "  ;
   saveEl.textContent += countStr;

   countEl.textContent = 0;
   count = 0;

}


