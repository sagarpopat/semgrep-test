document.body.onload = xss;
function xss()
{
	link = location.hash.slice(1);
	var a = document.createElement('a');
	var linkText = document.createTextNode("Link");
	a.appendChild(linkText);
	a.title = "XSS Test";
	a.href = link;
	test = document.getElementById("test");
	test.appendChild(a);
}
