## LearningJava 🎓
![License](https://img.shields.io/badge/lucaspanzera-LearningJava-orange)

Projeto criado com foco em aprender Java.  
Estudando com a [Maratona Java](https://www.youtube.com/watch?v=kkOSweUhGZM&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL) por [DevDojo](https://www.youtube.com/@DevDojoBrasil).

### Dia 01

#### Aula 01 á 05 ✅

##### Aula 01
**Como funciona o Java?**
- O Java possui a Java Virtual Machine (JVM), que interpreta o código escrito e compilado, permitindo que seja executado em qualquer sistema operacional que tenha a JVM.
- O Bytecode transforma o programa `.java` em um arquivo com extensão `.class`.
- Linguagem interoperável.
- Mesmo programa para vários sistemas operacionais, basta ter a JVM.

---

##### Aula 02
**JRE X JDK**
- **JRE**: Ambiente de execução Java, apenas executa Java.
- **JDK**: Kit de desenvolvimento Java, para desenvolver aplicações em Java, possui JRE, Debug, Compilador, etc.
- Ambos possuem uma JVM dentro.

---

##### Aula 03
O comando `javac` compila o projeto `.java` para `.class`, tornando-o executável.  
**Sintaxe**: `javac NomeArquivo.java`  
Para executar o `.class`: `java NomeArquivo`

---

##### Aula 04
```plaintext
projeto/
├── idea/  # Ambiente de desenvolvimento / IDE
├── out/   # Armazena os arquivos compilados do projeto
│   └── classes.class
├── src/   # Armazena o código-fonte do projeto
│   └── classes.java
└── 
```

Palavras Reservadas Java
 ```plaintext
abstract  
assert  
boolean  
break  
byte  
case  
catch  
char  
class  
const  
continue  
default  
do  
double  
else  
enum  
extends  
final  
finally  
float  
for  
goto  
if  
implements  
import  
instanceof  
int  
interface  
long  
native  
new  
package  
private  
protected  
public  
return  
short  
static  
strictfp  
super  
switch  
synchronized  
this  
throw  
throws  
transient  
try  
void  
volatile  
while 
  ```
##### Aula 05
**Criação de classes**
- Começa sempre com letra maiúscula.
- Palavra composta sempre com letra maiúscula.

**Método `main` é o ponto de entrada para a JVM.**

**Comentários**
- `//` Para 1 linha
- `/*` Para 1 linha ou mais
- `/**` Para documentação Java

**Criar variáveis**
1. O tipo da variável (ex: `int`)
2. O identificador / nome da variável (ex: `idade`)
3. Iniciar uma variável usando o "=" (ex: `= 10`)

**Variáveis começam com letra minúscula.**

**Variáveis Primitivas**
```plaintext
int
double
float
boolean
char
byte
short
long 
```

### Dia 02

#### Aula 06 ✅

Para escrever variáveis e texto, fazemos da seguinte maneira.
```plaintext
System.out.println("Texto" +variável);
```

### Operadores Simples
| Operador | Descrição | Exemplo |
|----------|-----------|---------|
| + | Adição | `a + b` |
| - | Subtração | `a - b` |
| * | Multiplicação | `a * b` |
| / | Divisão | `a / b` |
| % | Módulo (resto da divisão) | `a % b` |
| ++ | Incremento | `a++` ou `++a` |
| -- | Decremento | `a--` ou `--a` |

