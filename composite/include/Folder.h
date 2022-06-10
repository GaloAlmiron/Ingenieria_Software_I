#ifndef Folder_h
#define Folder_h

#include <iostream>
#include <vector>
#include <algorithm>

#include <IComposableOfListable.h>
#include <IListable.h>




class Folder : public IListable, public IComposableOfListable
{

    private:
        std::string m_nodeName;
        std::vector < IListable*> m_children;

    public:
        Folder(std::string nodeName);

        virtual ~Folder();
        
        void list(int depth);
        void add (IListable* component);
        void remove(IListable* component);


};
#endif //folder_h