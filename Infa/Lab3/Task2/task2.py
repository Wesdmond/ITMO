import re


def check_hayku(string):
    """Check is string is hayku."""
    re_pattern = re.compile(r'/')
    lines = re_pattern.split(string)
    lines_count = len(lines)
    if lines_count != 3:
        return "Не хайку. Должно быть 3 строки."
    re_pattern = re.compile(r'[аиуэояюеёыАИУЭОЯЮЕЁЫaeiouyAEIOUY]')
    vowels_in_lines = [len(re_pattern.findall(lines[i])) for i in range(3)]
    if vowels_in_lines[0] == 5 and vowels_in_lines[1] == 7 and vowels_in_lines[2] == 5:
        return "Хайку!"
    else:
        return "Не хайку."
