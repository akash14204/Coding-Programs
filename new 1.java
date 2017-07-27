ll fun(ll p,ll q,ll p1,ll q1,ll p2,ll q2)
{
    ll value=0;
    // point
    if(p1==p2&&q1==q2){
        value=abs(p1-p)+abs(q1-q);
    }
    else if(p1==p2)
    {
        if(p==p1){  // along line
            if(q>=min(q1,q2)&&q<=map(q1,q2)) value=0;
            else value=min(abs(q-q1),abs(q-q2));
        }
        else if(q>=min(q1,q2)&&q<=map(q1,q2)){
            value=abs(p-p1);
        }
        else{
            ll m1,m2;
            m1=abs(p-p1)+abs(q-q1);
            m2=abs(p-p2)+abs(q-q2);
            value=min(m1,m2);
        }
    }
    else
    {
        if(q==q1){  // along line
            if(p>=min(p1,p2)&&p<=map(p1,p2)) value=0;
            else value=min(abs(p-p1),abs(p-p2));
        }
        else if(p>=min(p1,p2)&&p<=map(p1,p2)){
            value=abs(q-q1);
        }
        else{
            ll m1,m2;
            m1=abs(p-p1)+abs(q-q1);
            m2=abs(p-p2)+abs(q-q2);
            value=min(m1,m2);
        }
    }
    valueetuvaluen value;
}