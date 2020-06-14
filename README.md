# SI_Lab2_165046
##Ана Тошева, индекс 165046
###Група на код:
Ја добив групата на код 4
<br />  
###Control Flow Graph
#![Screenshot](SI_lab2_165046\CFG.jpg)
###Цикломатска комплексност
Цикломатска комплекност е 7 
<br/>
N=19, E=24 => E-N+2=7,
каде N e бројот на јазли,а E е бројот на рабови<br /> 

###Тест случаи според критериумот Every Path
1.user=null <br/>
2.username=null password=null <br/>
3.username=Ana password=AnA123 <br/>
4.username=anything password=abc12233@ (не го исполнува условот за голема буква)<br/>
5.username=anything password=abc12233D (не го исполнува условот за специјален силмбол)<br/>
6.username=anything password=123.@$243 (не го исполнува условот за буква)<br/>
Минимален број на test cases = 6
###Тест случаи според критериумот Multiple conditions
1.if (user.getUsername()!=null && user.getPassword()!=null)
T&&T -> username !=null password !=null
T&&F -> username=anything password=null
F&&X -> username = null password=anything
2.if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8)
T&&T -> username is not contained in pass and passwords length >=8
T&&F -> username is not contained in pass and passwords length < 8
F&&X -> username contained in pass and password=anything
3.if (digit && upper && special)
T&&T&&T -> password contains digit,upper case and special sign
T&&T&&F -> password contains digit and upper case but not special sign
T&&F&&T ->password contains digit and special sign but not upper case 
F&&X&&X -> password does not contain a digit
###Објаснување на напишаните unit tests
1.Every Path
Избрани се test cases што ќе ја поминат секоја патека во графот.
Во овој случај се 6.
2.Multiple conditions
Избрани се test cases за секој if кој содржи повеќе од еден услов.
Во кој се разгледува секоја можна комбинација на True or/and False
