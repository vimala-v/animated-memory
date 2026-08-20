Simple Java login example

Compile:

  javac -d out src/com/example/login/Main.java

Run:

  java -cp out com.example.login.Main

Behavior:
- Prompts for Username and Password on the console.
- If both username and password equal "root", prints "Successfully logged in".
- Otherwise prints "Login failed".

Notes:
- When run from some IDEs or environments, System.console() may be null; the program falls back to using Scanner for input.
