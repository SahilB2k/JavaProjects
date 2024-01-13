let goto = document.getElementById("btn1");
goto.addEventListener(
    "click",
    function(){
        // window.location.assign("https://github.com/SahilB2k");
        window.open("https://github.com/SahilB2k ","_blank" )
    }
)
let goto2 = document.getElementById("btn2");
goto2.addEventListener(
    "click",
    function(){
        // window.location.assign("https://github.com/SahilB2k")
        window.open("https://github.com/SahilB2k ","_blank" )
    }
)
let goto3 = document.getElementById("btn3");
goto3.addEventListener(
    "click",
    function(){
        
        // window.location.assign("https://github.com/SahilB2k?tab=repositories")
        window.open("https://github.com/SahilB2k?tab=repositories ","_blank" )
    }
)

let index=0;
function violet(){
  let colours = ["default","blue","red","green", "lightgreen","rgb(14, 14, 47)","darkblue","lavender","lightblue","violet","pink"];
  document.getElementsByTagName("body")[0].
   style.background = colours[index++]
   if(index>colours.length-1){
index=0;
   }
   
}
// let index=0;
// function violet(){
//   let colours = ["blue","red","green", "lightgreen","lavender","lightblue","violet","pink"];
//   document.getElementsByTagName("head");
//    StylePropertyMap.append("background-color",
//    "blue,yellow") ;
//    if(index>colours.length-1){
// index=0;
//    }
   
// }