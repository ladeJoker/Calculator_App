package com.example.calculatorapp

class CalculationsProcess () {
    var result = 0f
    var operator = ' '
    var num1 = ""
    var num2 = ""
    var showText = "0"

    fun operator(op: Char){
        operator = op
        showText += operator
    }

    fun setNum(num: String){
        if(operator==' '){ //if num1 empty
            num1 += num
            showText = num1
        }else{
            num2 += num
            val text = num1 + operator + num2
            showText = text
        }
    }

    fun setDot(){
        if(operator == ' '){
            if(num1 != "" && !num1.contains(".")){
                num1 += "."
            }
        }else{
            if(num2 != "" && !num2.contains(".")){
                num2 += "."
            }
        }

    }
    

    fun calculate(){
        if(operator != ' ') {
            when (operator) {
                '-' -> result = num1.toFloat() - num2.toFloat()
                '+' -> result = num1.toFloat() + num2.toFloat()
                '/' -> result = num1.toFloat() / num2.toFloat()
                '*' -> result = num1.toFloat() * num2.toFloat()
            }
            num2= ""
            num1= result.toString().trim()
            showText = result.toString()
        }
    }

    fun clearAll(){
        showText = "0"
        num1 = ""
        num2 = ""
        operator = ' '
        result = 0f
    }

    fun del(){
        if(num2 != ""){
            num2 = num2.substring(0,num2.length-1)
            processShowText()
        }else if (operator != ' '){
            operator = ' '
            processShowText()
        }else if(num1 != "") {
            num1 = num1.substring(0,num1.length-1)
            processShowText()
        }
    }

    fun processShowText(){
        val text: String
        if(num1==""){
            showText = "0"
        }else if(num1!="" && operator!=' '){
            showText = num1 + operator
        }else if(operator==' ' && num1!=""){
            showText = num1
        }else if(num2==""){
           showText = num1 + operator
       }else if(num2!=""){
           showText = num1 + operator + num2
       }


    }

    //i didnt understand what did this function exactly do therefore, i paste it from the solution
    fun onClickPlusMinus(){
        if(operator==' '){
            num1 = if(num1.startsWith("-")){
                num1.substring(1, num1.length)
            } else{
                "-$num1"
            }
            showText = num1
        }else{
            num2 = if(num2.startsWith("-")){
                num2.substring(1, num2.length)
            } else{
                "-$num2"
            }
            val text = num1 + operator + num2
            showText = text
        }
    }




}