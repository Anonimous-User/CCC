delivered = (int)(input())
collided = (int)(input())
pnts = delivered*50
decrsd = collided*(-10)
extra = 0
if(delivered>collided):
    extra = 500
print(pnts+decrsd+extra)