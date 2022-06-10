#ifndef Listable_h
#define Listable_h

#include <iostream>

class IListable
{
    public:
        virtual ~IListable(){};
        virtual void list (int depth) = 0;
};


#endif