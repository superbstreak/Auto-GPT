void fileRaceBadNoncompliant()
    {
        int res = access("/tmp/userfile", R_OK);
        if (res != 0)
            printf("access");

        int fd = open("/tmp/userfile", O_RDONLY);
    }
