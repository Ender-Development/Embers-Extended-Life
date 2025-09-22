#!/bin/sh
set -eu
printf 'Maven Username: '
read -r user
printf 'Maven Password (won'\''t be echoed): '
stty -echo # use stty instead of bash's `read -s`
read -r pass
stty echo
printf '%s\n%s\n' "$user" "$pass" >maven-publishing.credentials