for patch in ../mypatches/ranger-patches/*.diff; do
    git apply "$patch"
done
