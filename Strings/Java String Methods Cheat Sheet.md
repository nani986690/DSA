# Java String Methods Cheat Sheet

This README contains the most commonly used Java `String` methods with examples and their purpose.

## String Methods

| Method | Example | Purpose |
|--------|---------|---------|
| `length()` | `str.length()` | Returns the length of the string. |
| `charAt(int index)` | `str.charAt(0)` | Returns the character at the specified index. |
| `equals(String str)` | `str1.equals(str2)` | Compares two strings for equality (case-sensitive). |
| `equalsIgnoreCase(String str)` | `str1.equalsIgnoreCase(str2)` | Compares two strings ignoring case differences. |
| `toUpperCase()` | `str.toUpperCase()` | Converts all characters to uppercase. |
| `toLowerCase()` | `str.toLowerCase()` | Converts all characters to lowercase. |
| `substring(int beginIndex)` | `str.substring(2)` | Returns a substring starting from the given index. |
| `substring(int beginIndex, int endIndex)` | `str.substring(2, 5)` | Returns a substring from `beginIndex` to `endIndex - 1`. |
| `contains(CharSequence s)` | `str.contains("Java")` | Checks whether the string contains the specified sequence. |
| `replace(char oldChar, char newChar)` | `str.replace('a', 'b')` | Replaces all occurrences of a character. |
| `replace(CharSequence target, CharSequence replacement)` | `str.replace("Java", "Python")` | Replaces a substring with another substring. |
| `split(String regex)` | `str.split(" ")` | Splits the string into an array based on the given delimiter. |
| `trim()` | `str.trim()` | Removes leading and trailing spaces. |
| `indexOf(char ch)` | `str.indexOf('a')` | Returns the index of the first occurrence of a character. |
| `lastIndexOf(char ch)` | `str.lastIndexOf('a')` | Returns the index of the last occurrence of a character. |
| `isEmpty()` | `str.isEmpty()` | Returns `true` if the string is empty (`""`). |
| `isBlank()` *(Java 11+)* | `str.isBlank()` | Returns `true` if the string is empty or contains only whitespace. |
| `startsWith(String prefix)` | `str.startsWith("Ja")` | Checks whether the string starts with the specified prefix. |
| `endsWith(String suffix)` | `str.endsWith("va")` | Checks whether the string ends with the specified suffix. |
| `concat(String str)` | `str.concat(" World")` | Concatenates another string to the end. |
| `compareTo(String str)` | `str1.compareTo(str2)` | Compares two strings lexicographically. |
| `compareToIgnoreCase(String str)` | `str1.compareToIgnoreCase(str2)` | Lexicographically compares strings ignoring case. |
| `valueOf()` | `String.valueOf(123)` | Converts another data type to a string. |
| `toCharArray()` | `str.toCharArray()` | Converts the string into a character array. |
| `repeat(int count)` *(Java 11+)* | `"Hi".repeat(3)` | Repeats the string the specified number of times. |

## Example

```java
public class Main {
    public static void main(String[] args) {

        String str = " Java Programming ";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + str.trim());
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Substring: " + str.substring(5));
        System.out.println("Replace: " + str.replace("Java", "Python"));
        System.out.println("Starts With ' ': " + str.startsWith(" "));
        System.out.println("Ends With ' ': " + str.endsWith(" "));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));
    }
}
```

## Notes

- Strings in Java are **immutable**, meaning they cannot be modified after creation.
- Most string methods return a **new string** instead of changing the original string.
- String indexing starts from **0**.

---

**Happy Coding! 🚀**
