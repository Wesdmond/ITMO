import re


# Смайлик варианта: :-{\

# Task №1
def count_smiles(string):
    """Count smiles in string."""
    re_pattern = re.compile(r':-\{\\')
    cnt = len(re_pattern.findall(string))
    return cnt
