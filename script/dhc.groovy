



def packageName = _1;
def className = _2;
def methodName = _3;
def jsMethodName = _4;
def methodParameters = _5;
def methodReturnType = _6;
def date = _7;
def time = _8;

// 固定的时间,默认的是false
def confirmedDateTime = false;
def confirmedDateTimeString = "2017-06-15 12:20:40";
// 可以修改成自己的相关信息
def author = "Rush.D.Xzj";
def projectName = "DHCServ";
def version = "V1.0.0";
def copyright = "2017 yizukeji Inc. All rights reserved.";


def outputParams = "";
for(param in methodParameters) {
	outputParams += " * @param " + param + " : \n";
}
def outputReturnType = "";
// 如果返回值是void就不显示@return标签
if (methodReturnType != "void") {
	outputReturnType = " * @return : " + methodReturnType + "\n";
}

def outputMethodName 		= " * @Method : " + methodName + "\n";
def outputDesc 				= " * @Description : \n";
def outputDescForClass 		= " * @Description : " + className + "\n";
def outputAuthor 			= " * @author : " + author + "\n";
def outputDateTime			= " * @CreateDate : " + date + " " + time + "\n";
if (confirmedDateTime) {
	outputDateTime			= " * @CreateDate : " + confirmedDateTimeString + "\n";
}
def outputProjectName		= " * @Project : " + projectName + "\n";
def outputPackageName		= " * @Package : " + packageName + "\n";
def outputClass				= " * @Class : " + className + "\n";
def outputVersion			= " * @version : " + version + "\n";
def outputClassOtherInfo	= " * @Copyright : " + copyright + "\n";
outputClassOtherInfo	   += " * @Reviewed : " + "\n";
outputClassOtherInfo	   += " * @UpateLog :    Name    Date    Reason/Contents\n";
outputClassOtherInfo	   += " *             ---------------------------------------\n";
outputClassOtherInfo	   += " *                ****    ****    **** \n";
def outputJsMethodName		= " * @Method : " + jsMethodName + "\n";
def outputJsParams			= " * @param \n";
def outputJsReturnType		= " * @return : \n";

def result = "";

result += "\n";
if (methodName) {
	result += outputMethodName;
	result += outputDesc;
	result += outputParams;
	result += outputReturnType;
	result += outputAuthor;
	result += outputDateTime;
} else if (jsMethodName) {
	result += outputJsMethodName;
    result += outputDesc;
    // result += outputJsParams;
    // result += outputJsReturnType;
    result += outputAuthor;
    result += outputDateTime;
} else {
    result += outputProjectName;
    result += outputPackageName;
    result += outputClass;
    result += outputDescForClass;
    result += outputAuthor;
    result += outputDateTime;
    result += outputVersion;
    result += outputClassOtherInfo;
}
result += " *";
return result;


















































