# SI_Lab2_165046 
## Ана Тошева, индекс 165046
### Група на код:
Ја добив групата на код 4
<br />  
### Control Flow Graph
![CFG](https://user-images.githubusercontent.com/58486697/84582994-b72c1880-adf3-11ea-9bce-f6d2b2ef0641.jpg)
### Цикломатска комплексност
Цикломатска комплекност е 7 
<br/>
N=19, E=24 => E-N+2=7,
каде N e бројот на јазли,а E е бројот на рабови<br /> 

### Тест случаи според критериумот Every Path
1.user=null <br/>
2.username=null password=null <br/>
3.username=Ana password=AnA123 <br/>
4.username=anything password=abc12233@ (не го исполнува условот за голема буква)<br/>
5.username=anything password=abc12233D (не го исполнува условот за специјален силмбол)<br/>
6.username=anything password=123.@$243 (не го исполнува условот за буква)<br/>
Минимален број на test cases = 6 <br/>
### Тест случаи според критериумот Multiple conditions
1.if (user.getUsername()!=null && user.getPassword()!=null) <br/>
T&&T -> username !=null password !=null <br/>
T&&F -> username=anything password=null <br/>
F&&X -> username = null password=anything <br/>
2.if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) <br/>
T&&T -> username is not contained in pass and passwords length >=8 <br/>
T&&F -> username is not contained in pass and passwords length < 8 <br/>
F&&X -> username contained in pass and password=anything <br/>
3.if (digit && upper && special) <br/>
T&&T&&T -> password contains digit,upper case and special sign <br/>
T&&T&&F -> password contains digit and upper case but not special sign <br/>
T&&F&&T ->password contains digit and special sign but not upper case <br/>
F&&X&&X -> password does not contain a digit <br/>
### Објаснување на напишаните unit tests 
1.Every Path <br/>
Избрани се test cases што ќе ја поминат секоја патека во графот. <br/>
Во овој случај се 6. <br/>
2.Multiple conditions <br/>
Избрани се test cases за секој if кој содржи повеќе од еден услов. <br/>
Во кој се разгледува секоја можна комбинација на True or/and False <br/>
