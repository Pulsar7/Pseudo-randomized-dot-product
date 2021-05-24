#
#by Pulsar
#Year: 12021
#Date: 24.05.12021
#Twitter: https://twitter.com/7Pulsar
#Website: https://mein-wissen.herokuapp.com
#Python-Version: 3.8.2
#
import os,math

os.system("cls") #Windows
r = (-4,1,5)
s = (6,-2,9)

skalar_produkt = (r[0] * s[0] + r[1] * s[1] + r[2] * s[2])
betrag_r = ((r[0])**2 + (r[1])**2 + (r[2])**2)
betrag_s = ((s[0])**2 + (s[1])**2 + (s[2])**2)
quotient = ((skalar_produkt)/(math.sqrt(betrag_r) * math.sqrt(betrag_s)))
alpha = math.degrees((math.acos(quotient)))
print("Skalar-Produkt= %s"%(skalar_produkt))
print("|r|= %s"%(betrag_r))
print("|s|= %s"%(betrag_s))
print("Winkel zischen den Vektoren= %s°"%(alpha))
