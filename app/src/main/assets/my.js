// JavaScript Document
function rec() {
    var mymessage=confirm("你喜欢JavaScript吗？");
    if(mymessage==true) {
        document.write("很好，加油！");
    } else if(mymessage==false) {
//        document.write("要学javascript，而且必须学");
    }
}
function show_alert(var1){
    if(var1 == null || var1 == '') {
        alert('第一行\n第二行\n没有参数传入');
    } else {
        alert(trim(var1));
    }
}

function show_confirm(){
    var result = confirm('是否删除！');
    if(result){
        alert('删除成功！');
    }else{
        alert('不删除！');
    }
}

function show_prompt(){
    var value = prompt('输入你的名字：', '默认名字');
    if(value == null){
        alert('你取消了输入！');
    }else if(value == ''){
        alert('姓名输入为空，请重新输入！');
        show_prompt();
    }else{
        alert('你好，'+value);
    }
}

function callNative() {
    //调用android本地方法
    myObj.fun1FromAndroid("调用android本地方法fun1FromAndroid(String name)！！");
}

function funFromjs(var1) {
    show_alert(var1);
}

/**
* 删除左右两端的空格
*/
function trim(str) {
	if(str == null) return str;
	else return str.replace(/(^\s*)|(\s*$)/g, '');
}

function setTableData(datas) {
	var a = document.createElement("a"); //创建一个超链接a
	a.href = "http://baidu.com"; //赋值超链接网址
	a.innerHTML = "baidu.com"; //超链接显示的文字内容
	var tableData = document.getElementById("table_data");
	tableData.appendChild(a);
	/*var div = document.getElementById("table_data");
	div.innerHTML = "<input type='text' id='txt'/>";*/
}
	