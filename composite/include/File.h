#ifndef File_h
#define File_h

#include <IListable.h>

class File : public IListable {
    private:
        std::string m_nodeName;

    public:
        File (std::string nodeName);
        virtual  ~File();
        void list(int depth);
};   

#endif //file_h