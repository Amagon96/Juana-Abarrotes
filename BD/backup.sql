PGDMP         
                v        	   Abarrotes    10.3    10.3     ,           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            -           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            .           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            /           1262    16415 	   Abarrotes    DATABASE     i   CREATE DATABASE "Abarrotes" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
    DROP DATABASE "Abarrotes";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            0           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    13241    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            1           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16418 	   productos    TABLE     �   CREATE TABLE public.productos (
    clave integer NOT NULL,
    descripcion text,
    precio numeric,
    clasificacion text,
    existencia numeric,
    existencia_min numeric,
    existencia_max numeric
);
    DROP TABLE public.productos;
       public         postgres    false    3            �            1259    16416    productos_clave_seq    SEQUENCE     �   CREATE SEQUENCE public.productos_clave_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.productos_clave_seq;
       public       postgres    false    3    197            2           0    0    productos_clave_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.productos_clave_seq OWNED BY public.productos.clave;
            public       postgres    false    196            �           2604    16421    productos clave    DEFAULT     r   ALTER TABLE ONLY public.productos ALTER COLUMN clave SET DEFAULT nextval('public.productos_clave_seq'::regclass);
 >   ALTER TABLE public.productos ALTER COLUMN clave DROP DEFAULT;
       public       postgres    false    196    197    197            )          0    16418 	   productos 
   TABLE DATA               z   COPY public.productos (clave, descripcion, precio, clasificacion, existencia, existencia_min, existencia_max) FROM stdin;
    public       postgres    false    197   �       3           0    0    productos_clave_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.productos_clave_seq', 80, true);
            public       postgres    false    196            �           2606    16426    productos productos_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pkey PRIMARY KEY (clave);
 B   ALTER TABLE ONLY public.productos DROP CONSTRAINT productos_pkey;
       public         postgres    false    197            )     x�uW�r�H�=�z�����	�	�#�������%(ڜl���x��mYR�R��wv���g��&.�f7TYY�˼�]�g�J��Pt�q=�mڐ�2�=dCJ��T
M�yOsI���eZ4+|�K�Q�0t1���b�O_Ik��1�\�J	K��c*nS$�d&��j$#ݼ�@U%���]�un�嘰�(Og��M�..י���*��p�5����N�������Tk��t�n6�����J;�A��C;�Ml�U*�bO�H@T�)'���?�iS�5��ղ6�5�*��`I��@HJ �n���{�؇��oяۼ�r������P"��]�n�뷓��lh�h-b���[�9������`E(/*\:,b�3y%q�`HB��.b���ul��y�����(����ݘ��p��*K��q��=�5�AZ?!<Y�*�:��+�w�Yf
�u(��UU�Sy	�nS�&��u��!ge=�LAe�{��>���k�èO�^i����/נ�ֲ�� ' ���[�����,�������c�:���Y@A^���S�1sŷ�U���;bY+�	�POb�os�lV#�&�R:^�� =��
�K5	°�0XB!���i�q~!s���( �-�:�����8��œ3cuާ���*̿���Up�銳�,Ko���d��V����R.V���F�Z�R)���E�P�y' �=;c��*e9��93�P� C��M�f�蓮R;�s����kY,gc�0���%a�̧��VP�U���D����Y�C,��իï���;��]�<������9D�3z0|>�-�����@���r��i��#+s��ws~=��0�x⼍�����_�L3:��0�OVyG�R�X�p�	z��玠�j�׻=,w�;37Db膮�yҷ����W�+J7:�?�Dy�P��̬����&t�ĩ�S�a�-�T��=,�t�!���Yf��`IU�V{�Y��r&P�lp�hjz����31� :w@0�Ǎľ��y�aT��jͲ�-����,.�����`_��61j��p�9���[o��������º'г�i��hb�)����b ����t߬�H��S��@聇�5?�2~���}��X~�L'��X���\b��¬ � c6�|7�[�sC�̃X�s�,7�UO�W�{d��<0�Y/`1?��X�xИ	��S�	<���wq�<Z����+�����g�y��݀�`�<&��/�mf������1������r���v�R����͗�'O���{��?�Fw�}��b��;&����`QГ�x�fƚ#/f̧��.i��Oq�[�ǁ?l������tx�������B0�����T��L s����҄[3/O9�E������k��x�:����������x��W-��������gNqq#���|���.��s�ˢll�O�嗛,�3p�V�Q��N�C���ϥ�ht+�~�r��n����F�q���_)��+�z5     