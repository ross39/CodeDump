#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  day01.py
#  
#  Copyright 2017 RossHeaney <rossheaney@rossheaney-MacBookPro>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
#  
#  


def captcha(digits, offset=1):
    neighbors = digits[offset:] + digits[:offset]
    return sum(int(d) for d, n in zip(digits, neighbors) if d == n)


def half_captcha(digits):
    half = len(digits) // 2
    return captcha(digits, offset=half)


if __name__ == '__main__':
    with open('index.txt', 'r') as inp:
        number = inp.read().strip()
    print(captcha(number))  # part 1: 1182
print(half_captcha(number)) # part 2: 1152
