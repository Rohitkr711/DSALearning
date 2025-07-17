const password = 'P@A$ssword123';
// console.log(password.length);

if (password.length >= 8) {
    if (/[A-Z]/.test(password)) {
        if (/[a-z]/.test(password)) {
            if (/[0-9]/.test(password)) {
                if (/[^a-zA-Z0-9]/.test(password)) {
                    return 'Strong';

                }
                else {
                    return 'Week';
                }
            }
            else {
                return 'Week';
            }

        }
        else {
            return 'Week';
        }
    }
    else {
        return 'Week';
    }
}
else {
    return 'Week';
}
