// 输出方法名
groovyScript("def methodName = \"${_1}\"; def result = ' * @Method : ' + methodName + '\\n'; return result;", methodName())

// 输出描述
groovyScript("def result = ' * @Description : ' + '\\n'; return result;")

// 输出参数列表的子函数
groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {result+=' * @param ' + params[i] + ' : ' + '\\n'}; return result;}", methodParameters())

// 输出作者的子函数  这里可以改作者
groovyScript("def author = 'Rush.D.Xzj'; def result = ' * @author : ' + author + '\\n'; return result;")

// 输出返回值的子函数
groovyScript("def returnType = \"${_1}\"; def result = ' * @return : ' + returnType + '\\n'; return result;", methodReturnType())
// 如果是return 是 void 那就不显示这@return
groovyScript("def returnType = \"${_1}\"; if (returnType == 'void') { return ''; } else { return ' * @return : ' + returnType + '\\n'; }", methodReturnType())


// 输出日期的字函数, 这个可以更改日期格式
groovyScript("def date = \"${_1}\"; def time = \"${_2}\"; def result = ' * @CreateDate : ' + date + ' ' + time + '\\n'; return result;", date("yyyy-MM-dd"), time("HH:mm:ss"))

// 输出Project
groovyScript("def result = ' * @Project : 壹壹OA' + '\\n'; return result;")

// 输出package
groovyScript("def currentPackage = \"${_1}\"; def result = ' * @Package : ' + currentPackage + '\\n'; return result;", currentPackage())

// 输出class
groovyScript("def className = \"${_1}\"; def result = ' * @Class : ' + className + '\\n'; return result;", className())

// 输出copyright/reviewd/updatelog
groovyScript("def result = ' * @Copyright : 2017 yizukeji Inc. All rights reserved.' + '\\n'; result += ' * @Reviewed : ' + '\\n'; result += ' * @UpateLog :    Name    Date    Reason/Contents' + '\\n'; result += ' *             ---------------------------------------' + '\\n'; result += ' *                 ***        ****    **** ' + '\\n'; return result;")

// 输出version
groovyScript("def result = ' * @version : V1.0.0' + '\\n'; return result;")

// 输出jsMethodName
groovyScript("def jsMethodName = \"${_1}\"; def result = ' * @Method : ' + jsMethodName + '\\n'; return result;", jsMethodName())

// 输出 js 的return
groovyScript("def result = ' * @return : ' + '\\n'; return result;")




groovyScript("def methodName = \"${_1}\"; def jsMethodName = \"${_2}\"; def outputMethodName = \"${_3}\"; def outputDesc = \"${_4}\"; def outputParams = \"${_5}\"; def outputAuthor = \"${_6}\"; def outputReturnType = \"${_7}\"; def outputDateTime = \"${_8}\"; def outputPackage = \"${_9}\"; def outputClass = \"${_10}\"; def outputClassOtherInfo = \"${_11}\"; def outputProject = \"${_12}\"; def outputVersion = \"${_13}\"; def outputJsMethodName = \"${_14}\"; def outputJsReturnType = \"${_15}\"; def result = ''; if (methodName != 'null') { result += '\\n'; result += outputMethodName; result += outputDesc; result += outputParams; result += outputReturnType; result += outputAuthor; result += outputDateTime; result += ' *'; return result;} else if (jsMethodName != 'null') { result += '\\n'; result += outputJsMethodName; result += outputDesc; result += outputJsReturnType; result += outputAuthor; result += outputDateTime; result += ' *'; return result;} else { result += '\\n'; result += outputProject; result += outputPackage; result += outputClass; result += outputDesc; result += outputAuthor; result += outputDateTime; result += outputVersion; result += outputClassOtherInfo; result += ' *'; return result;} ", methodName(), jsMethodName(), groovyScript("def methodName = \"${_1}\"; def result = ' * @Method : ' + methodName + '\\n'; return result;", methodName()), groovyScript("def result = ' * @Description : ' + '\\n'; return result;"), groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {result+=' * @param ' + params[i] + ' : ' + '\\n'}; return result;}", methodParameters()), groovyScript("def author = 'Rush.D.Xzj'; def result = ' * @author : ' + author + '\\n'; return result;"), groovyScript("def returnType = \"${_1}\"; if (returnType == 'void') { return ''; } else { return ' * @return : ' + returnType + '\\n'; }", methodReturnType()), groovyScript("def date = \"${_1}\"; def time = \"${_2}\"; def result = ' * @CreateDate : ' + date + ' ' + time + '\\n'; return result;", date("yyyy-MM-dd"), time("HH:mm:ss")), groovyScript("def currentPackage = \"${_1}\"; def result = ' * @Package : ' + currentPackage + '\\n'; return result;", currentPackage()), groovyScript("def className = \"${_1}\"; def result = ' * @Class : ' + className + '\\n'; return result;", className()), groovyScript("def result = ' * @Copyright : 2017 yizukeji Inc. All rights reserved.' + '\\n'; result += ' * @Reviewed : ' + '\\n'; result += ' * @UpateLog :    Name    Date    Reason/Contents' + '\\n'; result += ' *             ---------------------------------------' + '\\n'; result += ' *                 ***        ****    **** ' + '\\n'; return result;"), groovyScript("def result = ' * @Project : 壹壹OA' + '\\n'; return result;"), groovyScript("def result = ' * @version : V1.0.0' + '\\n'; return result;"), groovyScript("def jsMethodName = \"${_1}\"; def result = ' * @Method : ' + jsMethodName + '\\n'; return result;", jsMethodName()), groovyScript("def result = ' * @return : ' + '\\n'; return result;"))

// jiwenfang
groovyScript("def methodName = \"${_1}\"; def jsMethodName = \"${_2}\"; def outputMethodName = \"${_3}\"; def outputDesc = \"${_4}\"; def outputParams = \"${_5}\"; def outputAuthor = \"${_6}\"; def outputReturnType = \"${_7}\"; def outputDateTime = \"${_8}\"; def outputPackage = \"${_9}\"; def outputClass = \"${_10}\"; def outputClassOtherInfo = \"${_11}\"; def outputProject = \"${_12}\"; def outputVersion = \"${_13}\"; def outputJsMethodName = \"${_14}\"; def outputJsReturnType = \"${_15}\"; def result = ''; if (methodName != 'null') { result += '\\n'; result += outputMethodName; result += outputDesc; result += outputParams; result += outputReturnType; result += outputAuthor; result += outputDateTime; result += ' *'; return result;} else if (jsMethodName != 'null') { result += '\\n'; result += outputJsMethodName; result += outputDesc; result += outputJsReturnType; result += outputAuthor; result += outputDateTime; result += ' *'; return result;} else { result += '\\n'; result += outputProject; result += outputPackage; result += outputClass; result += outputDesc; result += outputAuthor; result += outputDateTime; result += outputVersion; result += outputClassOtherInfo; result += ' *'; return result;} ", methodName(), jsMethodName(), groovyScript("def methodName = \"${_1}\"; def result = ' * @Method : ' + methodName + '\\n'; return result;", methodName()), groovyScript("def result = ' * @Description : ' + '\\n'; return result;"), groovyScript("if(\"${_1}\".length() == 2) {return '';} else {def result=''; def params=\"${_1}\".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList(); for(i = 0; i < params.size(); i++) {result+=' * @param ' + params[i] + ' : ' + '\\n'}; return result;}", methodParameters()), groovyScript("def author = 'jiwenfang'; def result = ' * @author : ' + author + '\\n'; return result;"), groovyScript("def returnType = \"${_1}\"; if (returnType == 'void') { return ''; } else { return ' * @return : ' + returnType + '\\n'; }", methodReturnType()), groovyScript("def date = \"${_1}\"; def time = \"${_2}\"; def result = ' * @CreateDate : ' + date + ' ' + time + '\\n'; return result;", date("yyyy-MM-dd"), time("HH:mm:ss")), groovyScript("def currentPackage = \"${_1}\"; def result = ' * @Package : ' + currentPackage + '\\n'; return result;", currentPackage()), groovyScript("def className = \"${_1}\"; def result = ' * @Class : ' + className + '\\n'; return result;", className()), groovyScript("def result = ' * @Copyright : 2017 yizukeji Inc. All rights reserved.' + '\\n'; result += ' * @Reviewed : ' + '\\n'; result += ' * @UpateLog :    Name    Date    Reason/Contents' + '\\n'; result += ' *             ---------------------------------------' + '\\n'; result += ' *                 ***        ****    **** ' + '\\n'; return result;"), groovyScript("def result = ' * @Project : 壹壹OA' + '\\n'; return result;"), groovyScript("def result = ' * @version : V1.0.0' + '\\n'; return result;"), groovyScript("def jsMethodName = \"${_1}\"; def result = ' * @Method : ' + jsMethodName + '\\n'; return result;", jsMethodName()), groovyScript("def result = ' * @return : ' + '\\n'; return result;"))






groovyScript("'\"' + \"${_1}\" + ' : ' + _2.collect { it + ' = [\" + ' + it + ' + \"]'}.join(', ') + '\"'", methodName(), methodParameters())





groovyScript("/Users/ceshi/Documents/goodgoodstudy/groovy/test.groovy", currentPackage(), className(), methodName(), jsMethodName(), methodParameters(), methodReturnType());




























