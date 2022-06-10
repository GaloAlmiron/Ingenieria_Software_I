#ifndef IComposableOfListable_h
#define IComposableOfListable_h

#include <iostream>
#include <IListable.h>

class IComposableOfListable
{
    public:
    virtual ~IComposableOfListable(){};
    virtual void add(IListable* component) = 0;
    virtual void remove(IListable* component) = 0;
};

#endif