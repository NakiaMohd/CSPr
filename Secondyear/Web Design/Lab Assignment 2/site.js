
function newCookie(name,value,days) {
var days = 10;// the number at the left reflects the number of days for the cookie to last
     // modify it according to your needs
if (days) {
var date = new Date();
date.setTime(date.getTime()+(days*24*60*60*1000));
var expires = "; expires="+date.toGMTString(); 
}
else {var expires = ""}
document.cookie = name+"="+value+expires+"; path=/"; 
}

function readCookie(name) {
var nameSG = name + "=";
var nuller = '';
if (document.cookie.indexOf(nameSG) == -1) {return nuller}
var ca = document.cookie.split(';');
for(var i=0; i<ca.length; i++) {
var c = ca[i];
while (c.charAt(0)==' ') c = c.substring(1,c.length);
if (c.indexOf(nameSG) == 0) return c.substring(nameSG.length,c.length);
}
return null;
}

function eraseCookie(name) {
newCookie(name,"",1); 
}

function toMem(a) {
newCookie('When/Where', document.myform.ww.value);  
newCookie ('Event', document.myform.ev.value);  
newCookie('Emotion', document.myform.em.value);   
newCookie ('Automatic', document.myform.auto.value);  
newCookie('Rational response', document.myform.rr.value); 
}

function delMem(a) {
eraseCookie('When/Where');  // make sure to add the eraseCookie function for every field
eraseCookie('Event');  
eraseCookie('Emotion');
eraseCookie('Automatic');  
eraseCookie('Rational response');
document.myform.ww.value = '';  // add a line like this for every field
document.myform.ev.value = '';
document.myform.em.value = '';
document.myform.auto.value = '';
document.myform.rr.value = '';
}

function remCookie() {
document.myform.ww.value = readCookie("When/Where");
document.myform.ev.value = readCookie("Event");
document.myform.em.value = readCookie("Emotion");
document.myform.ev.value = readCookie("Automatic");
document.myform.em.value = readCookie("Rational response");

function addLoadEvent(func) {
var oldonload = window.onload;
if (typeof window.onload != 'function') {
window.onload = func;
} 
else {
window.onload = function() {
if (oldonload) {
oldonload();
}
func();
}
}
}

addLoadEvent(function() {
remCookie();
});

	function myFunction() {
	var x = document.getElementById("myText");
    var currentVal = x.value;
	
	document.getElementById("ww").innerHTML = currentVal;
}


}

