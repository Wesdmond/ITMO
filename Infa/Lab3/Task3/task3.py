import re


def check_email(string):
    re_pattern = re.compile(r'([\w._]+)@(\w+\.\w+)')
    re_match = re_pattern.fullmatch(string)
    if re_match:
        return re_match[2]
    else:
        return 'Fail!'

    # Other realization.
    # email_parts = re.split(r'@', string)
    # if len(email_parts) != 2:
    #     return 'Fail!'
    # email_adress = email_parts[0]
    # email_server = email_parts[1]

